package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentCodeTwo: ImageVector
    get() {
        val current = _documentCodeTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentCodeTwo",
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
                moveTo(x = 21.0f, y = 13.03f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -1.5f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 4.5f, y1 = 2.0f, x2 = 3.0f, y2 = 4.0f, x3 = 3.0f, y3 = 7.0f)
                verticalLineToRelative(dy = 7.0f)
                moveToRelative(dx = 8.0f, dy = 8.0f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.5f, y = 4.5f)
                verticalLineToRelative(dy = 2.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.0f, dy1 = 2.0f)
                horizontalLineToRelative(dx = 2.0f)
                moveTo(x = 4.0f, y = 17.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                moveToRelative(dx = 3.0f, dy = -4.0f)
                lineToRelative(dx = 2.0f, dy = 2.0f)
                lineToRelative(dx = -2.0f, dy = 2.0f)
            }
        }.build().also { _documentCodeTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _documentCodeTwo: ImageVector? = null
