package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Import: ImageVector
    get() {
        val current = _import
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Import",
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
                moveTo(x = 22.0f, y = 10.76f)
                arcToRelative(a = 0.86f, b = 0.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.86f, dy1 = -0.86f)
                horizontalLineTo(x = 2.86f)
                arcTo(horizontalEllipseRadius = 0.85f, verticalEllipseRadius = 0.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 10.76f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.89f, dx2 = 4.11f, dy2 = 10.0f, dx3 = 10.0f, dy3 = 10.0f)
                reflectiveCurveToRelative(dx1 = 10.0f, dy1 = -4.12f, dx2 = 10.0f, dy2 = -10.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.46f, y = 15.9f)
                lineToRelative(dx = 2.85f, dy = -2.84f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -1.56f, dy = 1.56f)
                verticalLineTo(y = 3.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 9.57f)
                lineTo(x = 9.62f, y = 12.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                quadToRelative(dx1 = -0.22f, dy1 = 0.23f, dx2 = -0.22f, dy2 = 0.53f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.3f, dx2 = 0.07f, dy2 = 0.38f, dx3 = 0.22f, dy3 = 0.53f)
                lineToRelative(dx = 2.85f, dy = 2.84f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.05f, dy1 = 0.0f)
            }
        }.build().also { _import = it }
    }

@Suppress("ObjectPropertyName")
private var _import: ImageVector? = null
