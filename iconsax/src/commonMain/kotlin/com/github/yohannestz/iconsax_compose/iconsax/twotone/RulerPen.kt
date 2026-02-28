package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RulerPen: ImageVector
    get() {
        val current = _rulerPen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RulerPen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.47f, y = 19.0f)
                verticalLineTo(y = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = -4.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 14.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = 4.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -3.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.47f, y = 6.0f)
                horizontalLineToRelative(dx = 5.0f)
                moveToRelative(dx = -5.0f, dy = 12.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -4.0f, dy = -4.05f)
                lineToRelative(dx = 5.0f, dy = 0.05f)
                moveToRelative(dx = -5.0f, dy = -4.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.49f, y = 2.0f)
                arcToRelative(a = 2.96f, b = 2.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.96f, dy1 = 2.95f)
                verticalLineToRelative(dy = 12.96f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = 1.52f)
                lineToRelative(dx = 0.82f, dy = 1.36f)
                curveToRelative(dx1 = 0.94f, dy1 = 1.57f, dx2 = 2.49f, dy2 = 1.57f, dx3 = 3.43f, dy3 = 0.0f)
                lineToRelative(dx = 0.82f, dy = -1.36f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.42f, dy1 = -1.52f)
                verticalLineTo(y = 4.95f)
                arcTo(horizontalEllipseRadius = 2.96f, verticalEllipseRadius = 2.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.49f, y1 = 2.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.44f, y = 7.0f)
                horizontalLineTo(x = 2.53f)
            }
        }.build().also { _rulerPen = it }
    }

@Suppress("ObjectPropertyName")
private var _rulerPen: ImageVector? = null
