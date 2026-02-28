package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val People: ImageVector
    get() {
        val current = _people
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.People",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.53f, y = 7.77f)
                horizontalLineToRelative(dx = -0.21f)
                arcToRelative(a = 2.87f, b = 2.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.78f, dy1 = -2.88f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.78f, dy1 = 0.0f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.79f, dy1 = 2.88f)
                moveToRelative(dx = 3.26f, dy = 6.93f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.14f, dy1 = 0.84f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = -2.69f)
                quadToRelative(dx1 = -0.01f, dy1 = -1.52f, dx2 = -0.65f, dy2 = -2.78f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.18f, dy1 = 0.83f)
                curveToRelative(dx1 = 1.58f, dy1 = 1.04f, dx2 = 1.58f, dy2 = 2.75f, dx3 = 0.01f, dy3 = 3.8f)
                moveTo(x = 6.44f, y = 7.77f)
                horizontalLineToRelative(dx = 0.21f)
                arcToRelative(a = 2.87f, b = 2.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.78f, dy1 = -2.88f)
                arcToRelative(a = 2.89f, b = 2.89f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -5.77f, dy1 = 0.0f)
                arcToRelative(a = 2.87f, b = 2.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.78f, dy1 = 2.88f)
                moveToRelative(dx = 0.11f, dy = 5.08f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.6f, dy1 = 2.72f)
                arcToRelative(a = 6.2f, b = 6.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.97f, dy1 = -0.86f)
                curveToRelative(dx1 = -1.58f, dy1 = -1.05f, dx2 = -1.58f, dy2 = -2.76f, dx3 = 0.0f, dy3 = -3.81f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -0.85f)
                arcToRelative(a = 6.4f, b = 6.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.63f, dy1 = 2.8f)
                moveToRelative(dx = 5.57f, dy = 3.02f)
                horizontalLineToRelative(dx = -0.26f)
                arcToRelative(a = 3.43f, b = 3.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.31f, dy1 = -3.43f)
                arcToRelative(a = 3.45f, b = 3.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.89f, dy1 = 0.0f)
                arcToRelative(a = 3.43f, b = 3.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.32f, dy1 = 3.43f)
                moveToRelative(dx = -3.25f, dy = 2.07f)
                curveToRelative(dx1 = -1.51f, dy1 = 1.01f, dx2 = -1.51f, dy2 = 2.67f, dx3 = 0.0f, dy3 = 3.67f)
                arcToRelative(a = 6.1f, b = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.26f, dy1 = 0.0f)
                curveToRelative(dx1 = 1.51f, dy1 = -1.01f, dx2 = 1.51f, dy2 = -2.67f, dx3 = 0.0f, dy3 = -3.67f)
                arcToRelative(a = 6.1f, b = 6.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.26f, dy1 = 0.0f)
            }
        }.build().also { _people = it }
    }

@Suppress("ObjectPropertyName")
private var _people: ImageVector? = null
