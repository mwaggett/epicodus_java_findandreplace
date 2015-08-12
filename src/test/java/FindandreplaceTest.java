import org.fluentlenium.adapter.FluentTest;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class FindandreplaceTest extends FluentTest {

  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @Test
  public void replaceWordInSentence_replaceDogWithCat_true(){
    Findandreplace replace = new Findandreplace();
    String expValue = "I have a pet cat";
    assertEquals(expValue, replace.replaceWordInSentence("I have a pet dog", "dog", "cat"));
  }

  @Test
  public void replaceWordInSentence_replacePartialCatWithDog_true(){
    Findandreplace replace = new Findandreplace();
    String expValue = "I am walking my dog to the doghedral";
    assertEquals(expValue, replace.replaceWordInSentence("I am walking my cat to the cathedral", "cat", "dog"));
  }

  @ClassRule
  public static ServerRule server = new ServerRule();
}
