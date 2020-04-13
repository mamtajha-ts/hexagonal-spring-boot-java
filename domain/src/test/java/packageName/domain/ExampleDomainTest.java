package packageName.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ExampleDomainTest {

  @Test
  @DisplayName("should init")
  public void init() {
    assertThat(Boolean.TRUE).isTrue();
  }
}
