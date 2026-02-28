package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Security: ImageVector
    get() {
        val current = _security
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Security",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.33f, y = 5.67f)
                lineTo(x = 6.59f, y = 17.41f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.54f, dy1 = -0.14f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.97f, dy1 = -6.15f)
                verticalLineTo(y = 6.73f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.38f, dy1 = -2.06f)
                lineToRelative(dx = 5.57f, dy = -2.28f)
                arcToRelative(a = 5.1f, b = 5.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.92f, dy1 = 0.0f)
                lineTo(x = 18.0f, y = 4.04f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.33f, dy1 = 1.63f)
                moveToRelative(dx = 0.94f, dy = 1.37f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.64f, dy1 = 0.77f)
                verticalLineToRelative(dy = 3.31f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.9f, dx2 = -3.55f, dy2 = 9.47f, dx3 = -8.4f, dy3 = 10.81f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.03f, dy1 = 0.0f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.87f, dy1 = -1.95f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.11f, dy1 = -1.5f)
                curveToRelative(dx1 = 2.18f, dy1 = -2.23f, dx2 = 8.56f, dy2 = -8.73f, dx3 = 11.77f, dy3 = -11.44f)
            }
        }.build().also { _security = it }
    }

@Suppress("ObjectPropertyName")
private var _security: ImageVector? = null
