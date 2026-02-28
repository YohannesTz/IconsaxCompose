package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentCopy: ImageVector
    get() {
        val current = _documentCopy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentCopy",
            defaultWidth = 22.0.dp,
            defaultHeight = 22.0.dp,
            viewportWidth = 22.0f,
            viewportHeight = 22.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 12.4f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.0f, dx2 = -1.6f, dy2 = 5.6f, dx3 = -5.6f, dy3 = 5.6f)
                horizontalLineTo(x = 6.6f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -5.6f, dy2 = -1.6f, dx3 = -5.6f, dy3 = -5.6f)
                verticalLineToRelative(dy = -3.8f)
                curveTo(x1 = 1.0f, y1 = 7.6f, x2 = 2.6f, y2 = 6.0f, x3 = 6.6f, y3 = 6.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 12.4f)
                horizontalLineToRelative(dx = -3.2f)
                curveToRelative(dx1 = -2.4f, dy1 = 0.0f, dx2 = -3.2f, dy2 = -0.8f, dx3 = -3.2f, dy3 = -3.2f)
                verticalLineTo(y = 6.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.0f, y = 4.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveToRelative(dx = 6.0f, dy = 6.0f)
                verticalLineToRelative(dy = 6.19f)
                arcTo(horizontalEllipseRadius = 2.8f, verticalEllipseRadius = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.19f, y1 = 16.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.0f, y = 7.0f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -2.25f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -0.75f, dx3 = -3.0f, dy3 = -3.0f)
                verticalLineTo(y = 1.0f)
                close()
            }
        }.build().also { _documentCopy = it }
    }

@Suppress("ObjectPropertyName")
private var _documentCopy: ImageVector? = null
