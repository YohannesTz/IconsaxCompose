package com.github.yohannestz.iconsax_compose.iconsax.outline

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
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -21.5f)
                arcToRelative(a = 10.76f, b = 10.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 21.5f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 18.5f)
                arcToRelative(a = 9.26f, b = 9.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -18.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 14.57f, y = 10.89f)
                horizontalLineTo(x = 9.43f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.64f, dy1 = -1.14f)
                lineToRelative(dx = 2.57f, dy = -4.3f)
                curveToRelative(dx1 = 0.27f, dy1 = -0.44f, dx2 = 1.02f, dy2 = -0.44f, dx3 = 1.29f, dy3 = 0.0f)
                lineToRelative(dx = 2.57f, dy = 4.3f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.01f, dy1 = 0.76f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.66f, dy1 = 0.38f)
                moveToRelative(dx = -3.82f, dy = -1.5f)
                horizontalLineToRelative(dx = 2.49f)
                lineTo(x = 11.99f, y = 7.3f)
                close()
                moveToRelative(dx = 0.39f, dy = 7.5f)
                horizontalLineTo(x = 6.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.64f, dy1 = -1.13f)
                lineToRelative(dx = 2.57f, dy = -4.29f)
                curveToRelative(dx1 = 0.27f, dy1 = -0.45f, dx2 = 1.02f, dy2 = -0.45f, dx3 = 1.29f, dy3 = 0.0f)
                lineToRelative(dx = 2.57f, dy = 4.29f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = 1.13f)
                moveToRelative(dx = -3.82f, dy = -1.5f)
                horizontalLineToRelative(dx = 2.49f)
                lineToRelative(dx = -1.25f, dy = -2.08f)
                close()
                moveTo(x = 18.0f, y = 16.89f)
                horizontalLineToRelative(dx = -5.14f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.64f, dy1 = -1.13f)
                lineToRelative(dx = 2.57f, dy = -4.29f)
                curveToRelative(dx1 = 0.27f, dy1 = -0.45f, dx2 = 1.02f, dy2 = -0.45f, dx3 = 1.29f, dy3 = 0.0f)
                lineToRelative(dx = 2.57f, dy = 4.29f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 16.89f)
                moveToRelative(dx = -3.82f, dy = -1.5f)
                horizontalLineToRelative(dx = 2.49f)
                lineToRelative(dx = -1.25f, dy = -2.08f)
                close()
            }
        }.build().also { _autonio = it }
    }

@Suppress("ObjectPropertyName")
private var _autonio: ImageVector? = null
