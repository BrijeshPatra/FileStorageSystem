package com.project.FileStorageSystem.repositories;

import com.project.FileStorageSystem.entities.File;
import com.project.FileStorageSystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FileRepository extends JpaRepository<File,Long> {
    List<File> findByOwnerId(Long ownerId);
    Optional<File> findTopByNameAndOwnerOrderByVersionDesc(String name, User owner);
}
