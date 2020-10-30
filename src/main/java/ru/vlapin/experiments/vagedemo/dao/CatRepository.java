package ru.vlapin.experiments.vagedemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.vagedemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
