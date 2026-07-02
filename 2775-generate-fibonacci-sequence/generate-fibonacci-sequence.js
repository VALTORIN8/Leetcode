/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let current = 0;   // pehla number
    let next = 1;      // dusra number
    //aise hi krde comment sath baad mei samjhne mei easy hoga 
    while (true) {//yha  dekh //eg dekh call co// submit kre/?
        yield current;   // 🛑 current value bhejo aur ruk jao//idhar how//kuch toh ho rha
        [current, next] = [next, current + next];   // ▶️ resume par values update karo
    }//mereko lag rha oops use kra h something func bana diya bass //baki ka connection
};//thing is ye stop kb ho rha

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */