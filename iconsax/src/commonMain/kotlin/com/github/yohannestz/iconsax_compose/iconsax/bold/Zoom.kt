package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Zoom: ImageVector
    get() {
        val current = _zoom
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Zoom",
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
                moveToRelative(dx = 1.63f, dy = 12.29f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.92f, dy1 = 0.92f)
                lineToRelative(dx = -3.68f, dy = 0.03f)
                arcToRelative(a = 2.77f, b = 2.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.79f, dy1 = -2.77f)
                verticalLineToRelative(dy = -2.8f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.92f, dy1 = -0.92f)
                horizontalLineToRelative(dx = 3.69f)
                arcToRelative(a = 2.77f, b = 2.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.77f, dy1 = 2.77f)
                verticalLineToRelative(dy = 2.77f)
                close()
                moveTo(x = 17.75f, y = 14.0f)
                arcToRelative(a = 0.54f, b = 0.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.84f, dy1 = 0.45f)
                lineToRelative(dx = -1.92f, dy = -1.28f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.24f, dy1 = -0.45f)
                verticalLineTo(y = 11.3f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.24f, dy1 = -0.45f)
                lineToRelative(dx = 1.92f, dy = -1.28f)
                arcToRelative(a = 0.54f, b = 0.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.84f, dy1 = 0.45f)
                close()
            }
        }.build().also { _zoom = it }
    }

@Suppress("ObjectPropertyName")
private var _zoom: ImageVector? = null
