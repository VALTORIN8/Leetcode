/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let current = 0;   // pehla number
    let next = 1;      // dusra number
    while (true) {
        yield current;   // 🛑 current value bhejo aur ruk jao//idhar how//kuch toh ho rha
        [current, next] = [next, current + next];   // ▶️ resume par values update karo
    }
};
/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */