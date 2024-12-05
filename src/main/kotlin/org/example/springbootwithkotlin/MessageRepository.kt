package org.example.springbootwithkotlin

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>