package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Export: ImageVector
    get() {
        val current = _export
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Export",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.14f, y = 9.9f)
                horizontalLineToRelative(dx = -8.39f)
                verticalLineToRelative(dy = 5.48f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 9.9f)
                horizontalLineTo(x = 2.86f)
                arcTo(horizontalEllipseRadius = 0.85f, verticalEllipseRadius = 0.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 10.76f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.89f, dx2 = 4.11f, dy2 = 10.0f, dx3 = 10.0f, dy3 = 10.0f)
                reflectiveCurveToRelative(dx1 = 10.0f, dy1 = -4.11f, dx2 = 10.0f, dy2 = -10.0f)
                arcToRelative(a = 0.85f, b = 0.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.86f, dy1 = -0.86f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.75f, y = 5.8f)
                lineToRelative(dx = 1.56f, dy = 1.56f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = -2.85f, dy = -2.84f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineTo(x = 8.62f, y = 6.31f)
                quadTo(x1 = 8.4f, y1 = 6.54f, x2 = 8.4f, y2 = 6.84f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.3f, dx2 = 0.07f, dy2 = 0.38f, dx3 = 0.22f, dy3 = 0.53f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 1.56f, dy = -1.56f)
                verticalLineTo(y = 9.9f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineTo(y = 5.8f)
            }
        }.build().also { _export = it }
    }

@Suppress("ObjectPropertyName")
private var _export: ImageVector? = null
