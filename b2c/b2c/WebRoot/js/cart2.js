
/*******************************************************************************
 * 购物车
 * 测试环境：Firefox 54、Chrome 58、IE 11、Edge 40
 ******************************************************************************/

window.onload   = function() {
    var inputs  = document.getElementById("cart").getElementsByTagName("input");
    var checkAll    = null;
    for (i = 0; i < inputs.length; i++) {
//      /****************************************************
//       * 全选
//       ****************************************************/
        if (inputs[i].name === "all") {
            inputs[i].onclick   = function(e) {
                for (j = 0; j < inputs.length; j++) {
                    if (inputs[j].name === "id") {
                        inputs[j].checked   = e.target.checked;
                    }
                }
                calculate();
            };
            checkAll    = inputs[i];
        }
//      /****************************************************
//       * 切换选中状态
//       ****************************************************/
        if (inputs[i].name === "id") {
            inputs[i].onclick   = function(e) {
                var count   = 0;
                for (j = 0; j < inputs.length; j++) {
                    if (inputs[j].name === "id") {
                        count++;
                        if (inputs[j].checked) {
                            count--;
                        }
                    }
                }
                checkAll.checked    = (count === 0);
                calculate();
            };
        }
//
//      /****************************************************
//       * 减少购买数量
//       ****************************************************/
        if (inputs[i].name === "minus") {
            inputs[i].onclick   = function(e) {
                //更新数量
                var countInput  = e.target.nextElementSibling;
                var count       = parseInt(countInput.value);
                if (isNaN(count)) {
                    count   = 1;
                }
                if (count > 1) {
                    countInput.value    = --count;
                }
                //更新金额
                calculate();
            };
        }
//      /****************************************************
//       * 增加购买数量
//       ****************************************************/
        if (inputs[i].name === "plus") {
            inputs[i].onclick   = function(e) {
                //更新数量
                var countInput  = e.target.previousElementSibling;
                var count       = parseInt(countInput.value);
                if (isNaN(count)) {
                    count   = 1;
                }
                countInput.value    = ++count;
                //更新金额
                calculate();
            };
        }
//      
//      /****************************************************
//       * 手动输入数量
//       ****************************************************/
//      /
//  
//  /****************************************************
//   * 删除商品
//   ****************************************************/
    document.getElementById("cart-delete").onclick  = function(e) {
        var goodsList   = document.getElementById("cart-goods-list");
        var deleteTr    = [];
        for (i = 0; i < inputs.length; i++) {
            if (inputs[i].name === "all") {
                inputs[i].checked   = false;
            }
            if (inputs[i].name === "id" && inputs[i].checked) {
                deleteTr.push(inputs[i].parentElement.parentElement);
            }
        }
        for (j in deleteTr) {
            goodsList.removeChild(deleteTr[j]);
        }
        calculate();
        e.preventDefault();
    };
//
//  /****************************************************
//   * 初始化金额
//   ****************************************************/
    calculate();