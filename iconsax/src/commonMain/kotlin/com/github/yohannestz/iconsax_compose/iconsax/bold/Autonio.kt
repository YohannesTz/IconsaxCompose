package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Autonio: ImageVector
    get() {
        val current = _autonio
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Autonio",
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
                moveToRelative(dx = -1.3f, dy = 14.14f)
                horizontalLineTo(x = 6.44f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = -0.38f)
                lineToRelative(dx = 2.13f, dy = -3.55f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.43f, dy1 = 0.0f)
                lineToRelative(dx = 2.13f, dy = 3.55f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.22f, dy1 = 0.38f)
                moveToRelative(dx = -0.83f, dy = -6.0f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = -0.38f)
                lineToRelative(dx = 2.13f, dy = -3.55f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.43f, dy1 = 0.0f)
                lineToRelative(dx = 2.13f, dy = 3.55f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = 0.38f)
                close()
                moveToRelative(dx = 7.69f, dy = 6.0f)
                horizontalLineTo(x = 13.3f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.21f, dy1 = -0.38f)
                lineToRelative(dx = 2.13f, dy = -3.55f)
                arcToRelative(a = 0.25f, b = 0.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.43f, dy1 = 0.0f)
                lineToRelative(dx = 2.13f, dy = 3.55f)
                curveToRelative(dx1 = 0.09f, dy1 = 0.17f, dx2 = -0.03f, dy2 = 0.38f, dx3 = -0.22f, dy3 = 0.38f)
            }
        }.build().also { _autonio = it }
    }

@Suppress("ObjectPropertyName")
private var _autonio: ImageVector? = null
