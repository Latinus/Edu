package Command.A1.drawer;

import Command.A1.command.Command;
import java.awt.Color;

public class ColorCommand implements Command {
    // 그리는 대상
    protected Drawable drawable;
    // 그리는 색
    private Color color;
    // 생성자
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    // 실행
    public void execute() {
        drawable.setColor(color);
    }
}
