package com.emailmicroservice.emailmicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailmicroservice.emailmicroservice.models.EmailModel;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID > {

}
