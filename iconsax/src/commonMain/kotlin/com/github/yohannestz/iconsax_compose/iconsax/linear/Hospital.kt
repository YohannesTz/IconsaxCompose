package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hospital: ImageVector
    get() {
        val current = _hospital
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Hospital",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 22.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveTo(x = 17.0f, y = 2.0f)
                horizontalLineTo(x = 7.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 3.0f, y2 = 3.79f, x3 = 3.0f, y3 = 6.0f)
                verticalLineToRelative(dy = 16.0f)
                horizontalLineToRelative(dx = 18.0f)
                verticalLineTo(y = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.21f, dx2 = -1.0f, dy2 = -4.0f, dx3 = -4.0f, dy3 = -4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.06f, y = 15.0f)
                horizontalLineTo(x = 9.93f)
                arcToRelative(a = 0.95f, b = 0.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.94f, dy1 = 0.94f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                verticalLineToRelative(dy = -6.06f)
                arcTo(horizontalEllipseRadius = 0.9f, verticalEllipseRadius = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.06f, y1 = 15.0f)
                moveTo(x = 12.0f, y = 6.0f)
                verticalLineToRelative(dy = 5.0f)
                moveTo(x = 9.5f, y = 8.5f)
                horizontalLineToRelative(dx = 5.0f)
            }
        }.build().also { _hospital = it }
    }

@Suppress("ObjectPropertyName")
private var _hospital: ImageVector? = null
