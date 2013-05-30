package com.sohu.suc.designpattern;


/**
 * 工厂模式
 * 通过抽象DB中的产品，抽象DB工厂，达到更换类型的灵活扩展
 * @author wenpingliu
 *
 */
public class Factory {

}

interface DBFactory{
	public DBInstance getDBInstance();
	public DBConnection getConnection();
	public DBStatement getStatement();
}

class OracleFactory implements DBFactory{

	@Override
	public DBInstance getDBInstance() {
		return new OracleInstace() ;
	}

	@Override
	public DBConnection getConnection() {
		return new OracleConnection() ;
	}

	@Override
	public DBStatement getStatement() {
		return new OracleStatment() ;
	}
	
}

class MysqlFactory implements DBFactory{

	@Override
	public DBInstance getDBInstance() {
		return new MysqlInstace() ;
	}

	@Override
	public DBConnection getConnection() {
		return new MysqlConnection() ;
	}

	@Override
	public DBStatement getStatement() {
		return new MysqlStatment() ;
	}
	
}

class Db2Factory implements DBFactory{

	@Override
	public DBInstance getDBInstance() {
		return new DB2Instace() ;
	}

	@Override
	public DBConnection getConnection() {
		return new DB2Connection() ;
	}

	@Override
	public DBStatement getStatement() {
		return new DB2Statment() ;
	}
	
}

interface DBInstance{
	
}

class DB2Instace implements DBInstance{
	
}

class OracleInstace implements DBInstance{
	
}

class MysqlInstace implements DBInstance{
	
}

interface DBConnection{
	
}

class DB2Connection implements DBConnection{
	
}

class OracleConnection implements DBConnection{
	
}

class MysqlConnection implements DBConnection{
	
}

interface DBStatement{
	
}

class DB2Statment implements DBStatement{
	
}

class OracleStatment implements DBStatement{
	
}

class MysqlStatment implements DBStatement{
	
}