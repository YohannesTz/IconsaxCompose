package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Avalanche: ImageVector
    get() {
        val current = _avalanche
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Avalanche",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = -1.28f, dy = 13.41f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.54f, dy1 = 0.85f)
                horizontalLineTo(x = 6.44f)
                arcToRelative(a = 0.45f, b = 0.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.39f, dy1 = -0.68f)
                lineToRelative(dx = 5.61f, dy = -9.61f)
                arcToRelative(a = 0.45f, b = 0.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.04f)
                lineToRelative(dx = 1.56f, dy = 2.09f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.09f, dy1 = 2.05f)
                close()
                moveToRelative(dx = 6.83f, dy = 0.85f)
                horizontalLineToRelative(dx = -3.84f)
                arcToRelative(a = 0.46f, b = 0.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.39f, dy1 = -0.69f)
                lineToRelative(dx = 1.92f, dy = -3.2f)
                arcToRelative(a = 0.46f, b = 0.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.78f, dy1 = 0.0f)
                lineToRelative(dx = 1.92f, dy = 3.2f)
                arcToRelative(a = 0.46f, b = 0.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.39f, dy1 = 0.69f)
            }
        }.build().also { _avalanche = it }
    }

@Suppress("ObjectPropertyName")
private var _avalanche: ImageVector? = null
