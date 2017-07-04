package cn.base.baseplat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author XuHui(xh@gfire.cn)
 * @date 2017/5/16
 * @desc
 */
@SpringBootApplication
@EnableCaching
@EnableJpaRepositories(value = "cn.gfire.hgjs.*.dao", repositoryBaseClass = cn.gfire.base.jpa.dao.impl.BaseRepositoryImpl.class)
@EnableJpaAuditing
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
