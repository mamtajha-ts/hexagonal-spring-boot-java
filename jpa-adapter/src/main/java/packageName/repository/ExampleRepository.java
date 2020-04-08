package packageName.repository;

import java.util.List;
import java.util.stream.Collectors;
import packageName.domain.model.Example;
import packageName.domain.port.ObtainExample;
import packageName.repository.dao.ExampleDao;
import packageName.repository.entity.ExampleEntity;
import javax.annotation.Nonnull;

public class ExampleRepository implements ObtainExample {

  private ExampleDao exampleDao;

  public ExampleRepository(ExampleDao exampleDao) {
    this.exampleDao = exampleDao;
  }

  @Override
  @Nonnull
  public List<Example> getAllExamples() {
    return exampleDao.findAll().stream().map(ExampleEntity::toModel).collect(Collectors.toList());
  }
}
