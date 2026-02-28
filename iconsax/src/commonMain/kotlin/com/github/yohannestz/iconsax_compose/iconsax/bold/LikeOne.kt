package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LikeOne: ImageVector
    get() {
        val current = _likeOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LikeOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.39f, y = 18.49f)
                verticalLineTo(y = 8.33f)
                quadToRelative(dx1 = 0.0f, dy1 = -0.61f, dx2 = 0.34f, dy2 = -1.12f)
                lineToRelative(dx = 2.73f, dy = -4.06f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.41f, dy1 = -0.77f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.42f, dy1 = 2.41f)
                lineToRelative(dx = -0.52f, dy = 3.27f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.21f, dy1 = 0.78f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.69f, dy1 = 0.31f)
                horizontalLineToRelative(dx = 4.11f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.87f, dy1 = 0.88f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.2f, dy1 = 1.95f)
                lineToRelative(dx = -2.46f, dy = 7.49f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 2.25f)
                horizontalLineToRelative(dx = -3.9f)
                curveToRelative(dx1 = -0.67f, dy1 = 0.0f, dx2 = -1.61f, dy2 = -0.23f, dx3 = -2.04f, dy3 = -0.66f)
                lineToRelative(dx = -1.28f, dy = -0.99f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.78f, dy1 = -1.58f)
                moveTo(x = 5.21f, y = 6.38f)
                horizontalLineTo(x = 4.18f)
                curveTo(x1 = 2.63f, y1 = 6.38f, x2 = 2.0f, y2 = 6.98f, x3 = 2.0f, y3 = 8.46f)
                verticalLineToRelative(dy = 10.06f)
                curveTo(x1 = 2.0f, y1 = 20.0f, x2 = 2.63f, y2 = 20.6f, x3 = 4.18f, y3 = 20.6f)
                horizontalLineToRelative(dx = 1.03f)
                curveToRelative(dx1 = 1.55f, dy1 = 0.0f, dx2 = 2.18f, dy2 = -0.6f, dx3 = 2.18f, dy3 = -2.08f)
                verticalLineTo(y = 8.46f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.48f, dx2 = -0.63f, dy2 = -2.08f, dx3 = -2.18f, dy3 = -2.08f)
            }
        }.build().also { _likeOne = it }
    }

@Suppress("ObjectPropertyName")
private var _likeOne: ImageVector? = null
