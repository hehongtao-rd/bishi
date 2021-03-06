# 需求
完成接口设计、并实现其内部逻辑，以完成A用户转账给B用户的功能。2个用户的账户不在同一个数据库下。注意需要手写代码，尽量不要用伪代码。
提示：接口发布后会暴露给外部应用进行服务调用，请考虑接口规范、安全、幂等、重试、并发、有可能的异常分支、事务一致性、用户投诉、资金安全等的处理
# 分析
1. 保证转账接口的幂等性,同一个交易号只能进行一次转账操作,如果已存在，则将存在的转账信息返回
2. 转账过程（A账户向B账户转账）需要在一个事务里,避免造成死锁,将系统中的账户排序,账户id小的先执行
3. 为了保证在并发情况下,同一时刻只允许一个线程操作转账过程中涉及到的账户,但是其他账户可以被其他线程操作，
   因此选择数据的行锁（Mysql InnoDB行锁 for update实现）

# 设计
1. 定义ResultBody,同一系统返回结构
2. 定义GlobalExceptionHandler,统一处理系统异常
3. 定义ParaValidator,用于请求参数检查
4. 定义WebConfig,用于添加相关配置，如：添加FastJsonHttpMessageConverter


# 说明
1. 项目启动时,会从accounts.txt文件中加载账户信息,用于演示转账过程
2. 转账完成后,可以调用账户查询列表接口查看相关账户信息



