// enum 타임
//여러가지 값들에 각각 이름을 부여해 열거해두고 사용하는 타임

enum Role {
    //자동으로 숫자 할당
    ADMIN,
    USER,
    GUEST
}

enum Language {
    korean = "ko",
    english = "en"
}

const user1 = {
    name: "임동근",
    role: Role.ADMIN, //0 관리자
    language: Language.korean
}
const user2 = {
    name: "홍",
    role: Role.USER, //1일반유저
    language: Language.english
}

const user3 ={
    name: "악",
    role: Role.GUEST, //게스트
    language: Language.korean
}

console.log(user1, user2, user3);