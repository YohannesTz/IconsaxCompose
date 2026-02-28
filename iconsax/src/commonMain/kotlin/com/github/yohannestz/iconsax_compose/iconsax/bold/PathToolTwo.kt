package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PathToolTwo: ImageVector
    get() {
        val current = _pathToolTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PathToolTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.15f, y = 22.0f)
                horizontalLineTo(x = 9.83f)
                curveToRelative(dx1 = -1.54f, dy1 = 0.0f, dx2 = -2.68f, dy2 = -1.25f, dx3 = -2.38f, dy3 = -2.58f)
                lineToRelative(dx = 0.52f, dy = -2.32f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.98f, dy1 = -0.78f)
                horizontalLineToRelative(dx = 6.09f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.98f, dy1 = 0.78f)
                lineToRelative(dx = 0.52f, dy = 2.31f)
                curveToRelative(dx1 = 0.32f, dy1 = 1.43f, dx2 = -0.75f, dy2 = 2.59f, dx3 = -2.39f, dy3 = 2.59f)
                moveToRelative(dx = 4.67f, dy = -8.31f)
                lineToRelative(dx = -1.07f, dy = 0.94f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.32f, dy1 = 0.5f)
                horizontalLineTo(x = 7.59f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.33f, dy1 = -0.51f)
                lineToRelative(dx = -1.05f, dy = -0.94f)
                curveToRelative(dx1 = -1.72f, dy1 = -1.41f, dx2 = -1.73f, dy2 = -2.49f, dx3 = -0.41f, dy3 = -4.15f)
                lineToRelative(dx = 5.23f, dy = -6.61f)
                lineToRelative(dx = 0.11f, dy = -0.14f)
                curveToRelative(dx1 = 0.44f, dy1 = -0.52f, dx2 = 1.13f, dy2 = -0.08f, dx3 = 1.13f, dy3 = 0.6f)
                verticalLineToRelative(dy = 3.48f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = 0.76f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.76f, dy1 = -0.76f)
                verticalLineTo(y = 3.39f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.69f, dx2 = 0.68f, dy2 = -1.12f, dx3 = 1.13f, dy3 = -0.61f)
                lineTo(x = 14.0f, y = 2.9f)
                lineToRelative(dx = 5.22f, dy = 6.62f)
                curveToRelative(dx1 = 1.3f, dy1 = 1.66f, dx2 = 1.25f, dy2 = 2.69f, dx3 = -0.41f, dy3 = 4.16f)
                close()
            }
        }.build().also { _pathToolTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _pathToolTwo: ImageVector? = null
