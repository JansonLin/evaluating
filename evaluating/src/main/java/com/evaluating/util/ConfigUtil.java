
package com.evaluating.util;

import java.util.ArrayList;
import java.util.List;

import com.evaluating.model.config.Connect;
import com.evaluating.model.config.Server;
import com.evaluating.model.config.Service;

public class ConfigUtil {
	public static Server getConfigBean() {
		// 建立新的Server
		Server server = new Server();
		server.setName("服务器");
		List<Service> services = new ArrayList<Service>();
		server.setServices(services);

		// 构建第一个Service并放入Server的list
		Service service1 = new Service();
		service1.setName("服务1");
		List<Connect> connects1 = new ArrayList<Connect>();
		service1.setConnects(connects1);
		services.add(service1);

		// 构建第一个Service并放入Server的list
		Service service2 = new Service();
		service1.setName("服务2");
		List<Connect> connects2 = new ArrayList<Connect>();
		service1.setConnects(connects2);
		services.add(service2);

		// 构建第一个Connect并放入service1的connect List
		Connect connect1 = new Connect();
		connect1.setName("连接1 ");
		connect1.setPort("8080");
		connects1.add(connect1);

		// 构建第一个Connect并放入service1的connect List
		Connect connect2 = new Connect();
		connect2.setName("连接2 ");
		connect2.setPort("8081");
		connects1.add(connect2);

		// 构建第一个Connect并放入service1的connect List
		Connect connect3 = new Connect();
		connect3.setName("连接3 ");
		connect3.setPort("8082");
		connects2.add(connect3);

		return server;
	}
}
