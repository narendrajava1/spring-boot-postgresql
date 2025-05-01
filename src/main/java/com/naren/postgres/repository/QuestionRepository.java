package com.naren.postgres.repository;

import com.naren.postgres.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-postgresql
 * User: narendrajava1
 * GitHub: https://github.com/narendrajava1
 * Email: kolli7571@gmail.com
 * Date: 24/09/18
 * Time: 18.51
 * To change this template use File | Settings | File Templates.
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
}