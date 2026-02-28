package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Link: ImageVector
    get() {
        val current = _link
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Link",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.27f, y = 12.0f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 8.5f)
                curveTo(x1 = 2.0f, y1 = 5.48f, x2 = 4.47f, y2 = 3.0f, x3 = 7.5f, y3 = 3.0f)
                horizontalLineToRelative(dx = 5.0f)
                curveTo(x1 = 15.52f, y1 = 3.0f, x2 = 18.0f, y2 = 5.48f, x3 = 18.0f, y3 = 8.5f)
                reflectiveCurveTo(x1 = 15.53f, y1 = 14.0f, x2 = 12.5f, y2 = 14.0f)
                horizontalLineTo(x = 10.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.98f, y = 21.0f)
                horizontalLineTo(x = 11.5f)
                curveTo(x1 = 8.48f, y1 = 21.0f, x2 = 6.0f, y2 = 18.52f, x3 = 6.0f, y3 = 15.5f)
                reflectiveCurveTo(x1 = 8.47f, y1 = 10.0f, x2 = 11.5f, y2 = 10.0f)
                horizontalLineTo(x = 14.0f)
                moveToRelative(dx = 6.73f, dy = 2.0f)
                arcTo(horizontalEllipseRadius = 5.5f, verticalEllipseRadius = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 15.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.02f, dx2 = -2.47f, dy2 = 5.5f, dx3 = -5.5f, dy3 = 5.5f)
            }
        }.build().also { _link = it }
    }

@Suppress("ObjectPropertyName")
private var _link: ImageVector? = null
