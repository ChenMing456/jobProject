/**
 * Created by 小陈 on 2017/8/25.
 *
 */
// 最简单数组去重法

function dele_1(array){
    var n = [];//一个新的临时数组
//遍历当前数组
for(var i = 0; i < array.length; i++){
//如果当前数组的第i已经保存进了临时数组，那么跳过，
//否则把当前项push到临时数组里面

    //indexOf表示首次出现的位置，若为-1，则表示前面生成的n数组中还没有当前元素，所以将其push进去
        if(n.indexOf(array[i]) == -1)
            n.push(array[i]);
    }
    return n;
}

// 2.对象键值对法
// 该方法执行的速度比其他任何方法都快， 就是占用的内存大一些，
// 实现思路：新建一js对象以及新数组，遍历传入数组时，判断值是否为js对象的键，
// 不是的话给对象新增该键并放入新数组。
// 注意 点： 判断是否为js对象键时，会自动对传入的键执行“toString()”，
// 不同的键可能会被误认为一样；例如： a[1]、a["1"] 。解决上述问题还是得调用“indexOf”。
// 速度最快， 占空间最多（空间换时间）
function unique2(array){
    var n = {}, r = [], val, type;
    for (var i = 0; i < array.length; i++) {
        val = array[i];
        type = typeof val;
        if (!n[val]) {
            n[val] = [type];
            r.push(val);
        } else if (n[val].indexOf(type) < 0) {
            n[val].push(type);
            r.push(val);
        }
    }
    return r;
}