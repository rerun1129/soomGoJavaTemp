package chapter11._02_object;

public class ParentObject {
    /**
     * Object 클래스가 필요한 이유
     * 1. 일반적으로 필요한 공통 기능 제공
     *    객체의 정보를 제공하고, 이 객체가 다른 객체와 같은지 비교하고, 객체가 어떤 클래스로 만들어졌는지 확인하는 기능은
     *    모든 객체에게 필요한 기본 기능이다. 이런 기능을 객체를 만들 때 마다 항상 새로운 메서드를 정의해서 만들어야 한다
     *    면 상당히 번거로울 것이다.
     *    그리고 막상 만든다고 해도 개발자마다 서로 다른 이름의 메서드를 만들어서 일관성이 없을 것이다. 예를 들어서 객체의
     *    정보를 제공하는 기능을 만든다고 하면 어떤 개발자는 `toString()` 으로 또 어떤 개발자는 `objectInfo()` 와 같이
     *    서로 다른 이름으로 만들 수 있다. 객체를 비교하는 기능을 만들 때도 어떤 개발자는 `equals()` 로 어떤 개발자는
     *    `same()` 으로 만들 수 있다.
     *    `Object` 는 모든 객체에 필요한 공통 기능을 제공한다. `Object` 는 최상위 부모 클래스이기 때문에 모든 객체는 공통
     *    기능을 편리하게 제공(상속) 받을 수 있다.
     *
     * 2. 다형성 처리를 위해 필요한 기본을 마련해줌
     *    부모는 자식을 담을 수 있다. `Object` 는 모든 클래스의 부모 클래스이다. 따라서 모든 객체를 참조할 수 있다.
     *   `Object` 클래스는 다형성을 지원하는 기본적인 메커니즘을 제공한다. 모든 자바 객체는 `Object` 타입으로 처리될 수
     *   있으며, 이는 다양한 타입의 객체를 통합적으로 처리할 수 있게 해준다.
     *   만약 Object가 없다면 불특정한 요청에 대한 객체의 타입을 모두 지정해서 처리해야 하지만 Object가 있기 때문에 타입 캐스팅을 통해서
     *   모든 타입을 배열이나 컬렉션에 넣어둔 후에 처리가 가능하다.
     *
     * */
}
