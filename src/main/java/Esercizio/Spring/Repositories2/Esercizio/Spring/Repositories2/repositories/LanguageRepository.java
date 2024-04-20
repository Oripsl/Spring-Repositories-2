package Esercizio.Spring.Repositories2.Esercizio.Spring.Repositories2.repositories;

import Esercizio.Spring.Repositories2.Esercizio.Spring.Repositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("repo-prog-languages description"))
public interface LanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
