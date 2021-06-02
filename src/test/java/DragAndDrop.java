import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @Test
    void dragAndDropTest (){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(Condition.text("A"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(Condition.text("B"));
    }
}
