package Decorator.A2;

import java.util.Vector;

public class MultiStringDisplay extends Display {
    private Vector body = new Vector();             // 표시 문자열
    private int columns = 0;                        // 최대 문자수
    public void add(String msg) {                   // 문자열 추가
        body.add(msg);
        updateColumn(msg);
    }
    public int getColumns() {                       // 문자수
        return columns;
    }
    public int getRows() {                          // 줄 수
        return body.size();
    }
    public String getRowText(int row) {             // 줄의 내용
        return (String)body.get(row);
    }
    private void updateColumn(String msg) {         // 문자수를 갱신한다.
        if (msg.getBytes().length > columns) {
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < body.size(); row++) {
            int fills = columns - ((String)body.get(row)).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }
    private String spaces(int count) {              // 공백 작성
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}
