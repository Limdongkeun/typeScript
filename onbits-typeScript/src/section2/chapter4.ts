// 타입 별칭
type User = {
    id: number,
    name: string,
    nickName: string,
    bio: string,
    sex: string,
};

let user1 : User = {
    id: 1,
    name: "임동근",
    nickName: "teddy",
    bio: "aa",
    sex: "male"
}

let user2 : User = {
    id: 1,
    name: "임동근",
    nickName: "teddy",
    bio: "aa",
    sex: "male"
}

//인덱스 시그니처
type CountryCode = {
    [key: string]: string,
}

let conturyCodes: CountryCode = {
    KR: "Korea",
    US: "USA",
    JP: "Japan",
}