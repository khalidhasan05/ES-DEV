import data.Item

fun calculateTotalCost(cart: List<Item>): Double {
    var totalCost = 0.0
    for (item in cart) {
        totalCost += item.price
    }
    return totalCost
}
