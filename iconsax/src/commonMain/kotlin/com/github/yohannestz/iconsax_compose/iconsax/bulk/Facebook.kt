package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Facebook: ImageVector
    get() {
        val current = _facebook
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Facebook",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.18f, y1 = 2.0f, x2 = 2.01f, y2 = 4.17f, x3 = 2.01f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.92f, y = 9.28f)
                lineToRelative(dx = 0.05f, dy = 2.95f)
                lineToRelative(dx = 2.63f, dy = -0.04f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.3f, dy1 = 0.35f)
                lineToRelative(dx = -0.35f, dy = 1.91f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.25f)
                lineToRelative(dx = -2.25f, dy = 0.04f)
                lineToRelative(dx = 0.12f, dy = 7.25f)
                lineToRelative(dx = -3.0f, dy = 0.05f)
                lineToRelative(dx = -0.12f, dy = -7.25f)
                lineToRelative(dx = -1.7f, dy = 0.03f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = -0.3f)
                lineToRelative(dx = -0.03f, dy = -1.9f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.3f, dy1 = -0.3f)
                lineToRelative(dx = 1.7f, dy = -0.03f)
                lineToRelative(dx = -0.05f, dy = -3.25f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.95f, dy1 = -3.05f)
                lineToRelative(dx = 2.7f, dy = -0.04f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.3f, dy1 = 0.3f)
                lineToRelative(dx = 0.04f, dy = 2.4f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 0.3f)
                lineToRelative(dx = -2.4f, dy = 0.04f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.3f, dy1 = 0.29f)
            }
        }.build().also { _facebook = it }
    }

@Suppress("ObjectPropertyName")
private var _facebook: ImageVector? = null
