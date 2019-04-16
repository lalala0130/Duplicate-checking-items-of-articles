package com.Dao;

import java.util.List;
import com.Model.ArticalInfo;

interface IminfoDao {
	public List<ArticalInfo> loadall();
	public List<ArticalInfo> load(String title);
	public ArticalInfo loadinfo(String title);
}
