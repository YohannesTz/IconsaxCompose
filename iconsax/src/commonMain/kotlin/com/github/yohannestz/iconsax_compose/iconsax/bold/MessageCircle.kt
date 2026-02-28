package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageCircle: ImageVector
    get() {
        val current = _messageCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 5.25f, dy = 10.81f)
                lineToRelative(dx = -0.03f, dy = 0.49f)
                quadToRelative(dx1 = -0.23f, dy1 = 2.65f, dx2 = -3.12f, dy2 = 2.65f)
                horizontalLineToRelative(dx = -0.26f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = 0.21f)
                lineToRelative(dx = -0.79f, dy = 1.05f)
                curveToRelative(dx1 = -0.35f, dy1 = 0.47f, dx2 = -0.91f, dy2 = 0.47f, dx3 = -1.26f, dy3 = 0.0f)
                lineToRelative(dx = -0.79f, dy = -1.05f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.42f, dy1 = -0.21f)
                horizontalLineTo(x = 9.9f)
                curveToRelative(dx1 = -2.09f, dy1 = 0.0f, dx2 = -3.15f, dy2 = -0.52f, dx3 = -3.15f, dy3 = -3.15f)
                verticalLineToRelative(dy = -2.63f)
                quadToRelative(dx1 = 0.0f, dy1 = -2.89f, dx2 = 2.65f, dy2 = -3.12f)
                lineToRelative(dx = 0.5f, dy = -0.01f)
                horizontalLineToRelative(dx = 4.2f)
                quadToRelative(dx1 = 3.14f, dy1 = 0.0f, dx2 = 3.15f, dy2 = 3.15f)
                close()
            }
        }.build().also { _messageCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _messageCircle: ImageVector? = null
