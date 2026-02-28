package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowSquare: ImageVector
    get() {
        val current = _arrowSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowSquare",
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
                moveTo(x = 12.14f, y = 15.07f)
                verticalLineToRelative(dy = -1.96f)
                arcToRelative(a = 4.57f, b = 4.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.57f, dy1 = -4.57f)
                horizontalLineToRelative(dx = 1.96f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.62f, y = 8.55f)
                horizontalLineToRelative(dx = 1.96f)
                arcToRelative(a = 4.57f, b = 4.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.57f, dy1 = 4.57f)
                verticalLineToRelative(dy = 4.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.14f, y = 6.75f)
                lineToRelative(dx = -1.8f, dy = 1.8f)
                lineToRelative(dx = 1.8f, dy = 1.8f)
                moveToRelative(dx = 9.72f, dy = -3.6f)
                lineToRelative(dx = 1.8f, dy = 1.8f)
                lineToRelative(dx = -1.8f, dy = 1.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = 2.0f, dy2 = -7.0f, dx3 = 7.0f, dy3 = -7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = 2.0f, dx3 = 7.0f, dy3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -2.0f, dy2 = 7.0f, dx3 = -7.0f, dy3 = 7.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = -2.0f, dx3 = -7.0f, dy3 = -7.0f)
                verticalLineToRelative(dy = -1.98f)
            }
        }.build().also { _arrowSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowSquare: ImageVector? = null
