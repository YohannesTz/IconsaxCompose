package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentCloud: ImageVector
    get() {
        val current = _documentCloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentCloud",
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
                moveTo(x = 14.0f, y = 2.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                moveToRelative(dx = 13.0f, dy = -12.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -4.0f, dy2 = -1.0f, dx3 = -4.0f, dy3 = -4.0f)
                verticalLineTo(y = 2.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.76f, y = 18.26f)
                curveToRelative(dx1 = -2.35f, dy1 = 0.17f, dx2 = -2.35f, dy2 = 3.57f, dx3 = 0.0f, dy3 = 3.74f)
                horizontalLineToRelative(dx = 5.56f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.82f, dy1 = -0.7f)
                curveToRelative(dx1 = 1.65f, dy1 = -1.44f, dx2 = 0.77f, dy2 = -4.32f, dx3 = -1.4f, dy3 = -4.59f)
                curveToRelative(dx1 = -0.78f, dy1 = -4.69f, dx2 = -7.56f, dy2 = -2.9f, dx3 = -5.96f, dy3 = 1.56f)
            }
        }.build().also { _documentCloud = it }
    }

@Suppress("ObjectPropertyName")
private var _documentCloud: ImageVector? = null
