package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Model.ArticalInfo;
import com.Util.connectUtil;
import com.Util.pachongUtil;

import ansj_word.SplitWordsByAnsj;
import word_like.Wordlike;

public class InfoDao implements IminfoDao{
	@Override
	public List<ArticalInfo> loadall() {
		// TODO Auto-generated method stub
		Connection connection = connectUtil.getConnection();
		//׼��sql���
		String sql = "select * from information ";
		//������䴫�����
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		//������ֻ�ܷ���user����
		List<ArticalInfo> infos = new ArrayList<ArticalInfo>();
		ArticalInfo info = null;
			try {
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					info = new ArticalInfo();
					info.setTitle(resultSet.getString("title"));
					info.setContext(resultSet.getString("context"));
					info.setType(resultSet.getInt("type"));
					info.setBkcontext(resultSet.getString("bkcontext"));
					infos.add(info);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				connectUtil.close(resultSet);
				connectUtil.close(preparedStatement);
				connectUtil.close(connection);
			}
			return  infos;
	}
	
	public List<ArticalInfo> load(String title) {
		// TODO Auto-generated method stub
		Connection connection = connectUtil.getConnection();
		//׼��sql���
		String sql = "select * from information where title like '%"+title+"%'";
		//������䴫�����
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		//������ֻ�ܷ���user����
		List<ArticalInfo> infos = new ArrayList<ArticalInfo>();
		ArticalInfo info = null;
			try {
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					info = new ArticalInfo();
					info.setTitle(resultSet.getString("title"));
					info.setContext(resultSet.getString("context"));
					infos.add(info);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				connectUtil.close(resultSet);
				connectUtil.close(preparedStatement);
				connectUtil.close(connection);
			}
			return  infos;
	}
	
	public ArticalInfo loadinfo(String title) {
		// TODO Auto-generated method stub
		Connection connection = connectUtil.getConnection();
		//׼��sql���
		String sql = "select * from information where title='"+title+"'";
		//������䴫�����
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		//������ֻ�ܷ���user����
		ArticalInfo info = null;
			try {
				preparedStatement = connection.prepareStatement(sql);
//				preparedStatement.setString(1, title);
				resultSet = preparedStatement.executeQuery();
				while(resultSet.next()) {
					info = new ArticalInfo();
					info.setTitle(resultSet.getString("title"));
					info.setContext(resultSet.getString("context"));
					info.setBkcontext(resultSet.getString("bkcontext"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				connectUtil.close(resultSet);
				connectUtil.close(preparedStatement);
				connectUtil.close(connection);
			}
			return  info;
	}
	
	public void update(String title ,String a) {
		Connection connection = connectUtil.getConnection();
		//׼��sql���
		String sql = "update information set bkcontext=? where title= '"+title+"'";
		//������䴫�����
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, a);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connectUtil.close(preparedStatement);
			connectUtil.close(connection);
		}
	}
	
	public static void main(String args[]) {
		InfoDao info = new InfoDao();
		
		
	}

	


}
