/*
* 템플릿 리터럴 타입
*/

type Color = "red" | "green" | "blue";

type Animal = "dog" | "cat" | "bird" | "fish";

type ColorAndAnimal = `${Color} ${Animal}`;

const colorAndAnimal: ColorAndAnimal = "red dog";