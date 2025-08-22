/*
* 제네릭
*/

function func<T>(value: T) {
    return value;
}

func<string>("hello");
func<number>(10);
func<boolean>(true);