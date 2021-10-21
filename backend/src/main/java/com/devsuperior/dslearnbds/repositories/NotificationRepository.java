package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.constants.Queries;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
	@Query(Queries.JPQL_NOTIFICATION)
	Page<Notification> find(User user, boolean unreadOnly, Pageable pageable);
}
