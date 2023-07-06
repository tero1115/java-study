package ch00;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 어노테이션을 읽어서 생성자를 만들어 준다
@AllArgsConstructor
@NoArgsConstructor
// getName, setName 등 필드의 데이터를 읽거나 수정하는 메소드를 자동으로 만들어준다
@Getter
@Setter
// 인스턴스의 정보를 정리해서 보여주도록 toString을 오버라이딩 한다
@ToString
class Cat {
    private String name;
    private boolean male;
}

public class Study07 {
    public static void main(String[] args) {
        // 고양이 태어남
        Cat cat = new Cat("야옹이", true);

        // 고양이 이름이 뭐야?
        System.out.println(cat.getName());

        // 고양이 수컷이야?
        System.out.println(cat.isMale());

        // 고양이 이름 냐옹이로 바꿔
        cat.setName("냐옹이");

        // 너에 대해서 알려줘
        System.out.println(cat.toString());
    }
}
