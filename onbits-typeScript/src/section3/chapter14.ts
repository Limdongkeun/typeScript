/*
* 서로소 유니온 타입
* 교집합이 없는 타입들로만 만든 유니온 타입
*/

type Admin = {
    tag: "ADMIN"
    name: string,
    kickCount: number,
};

type Member = {
    tag: "MEMBER",
    name: string,
    point: number,
};

type Guenst = {
    tag: "GUEST",
    name: string,
    visitCount: number,
}

type User = Admin | Member | Guenst;

// admin -> kickCount, member -> point, guenst -> visitCount
function login(user: User) {

    switch (user.tag) {
        case "ADMIN":
            console.log(user.kickCount);
            break;
        case "MEMBER":
            console.log(user.point);
            break;
        case "GUEST":
            console.log(user.visitCount);
            break;
    }

}

// 비동기 작업의 결과흫 처리하는 객체

type loadingTask = {
    status: "loading",
};
type failedTask = {
    status: "failed",
    error: {
        message: string,
    },
}
type successTask = {
    status: "success",
    response: {
        data: string,
    }
};

type AsyncTask = loadingTask | failedTask | successTask;

function process(task: AsyncTask) {
    switch (task.status) {
        case "loading":
            console.log("loading");
            break;
        case "failed":
            console.log(`failed ${task.error.message}`);
            break;
        case "success":
            console.log(`success ${task.response.data}`);
            break;
    }
}

const loading: AsyncTask = {
    status: "loading",
}

const failed: AsyncTask = {
    status: "failed",
    error: {
        message: "error",
    },
}

const success: AsyncTask = {
    status: "success",
    response: {
        data: "data"
    }
}