/*
* 인덱스트 엑세스 타입
*/

interface Post {
    title: string,
    content: string,
    author: {
        id: number,
        name: string,
        age: number,
    };
}

function printAuthorInfo(author: Post["author"]) {
    console.log(author.id);
    console.log(author.name);
}

const post: Post = {
    title: "제목",
    content: "본문",
    author: {
        id: 1,
        name: "ㅁㅁ",
        age: 10,
    }
};

// 배열
type PostList = {
    title: string,
    content: string,
    author: {
        id: number,
        name: string,
        age: number,
    };
}[];

const postList: PostList[0] = {
    title: "제목",
    content: "본문",
    author: {
        id: 1,
        name: "ㅁㅁ",
        age: 10,
    }
};

function printAuthorInfo2(author: PostList[0]["author"]) {
    console.log(author.id);
    console.log(author.name);
}
