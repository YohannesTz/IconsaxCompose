package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardEdit: ImageVector
    get() {
        val current = _cardEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardEdit",
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
                moveTo(x = 2.0f, y = 8.5f)
                horizontalLineToRelative(dx = 9.5f)
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
                moveTo(x = 6.0f, y = 16.5f)
                horizontalLineToRelative(dx = 2.0f)
                moveToRelative(dx = 2.5f, dy = 0.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 12.03f)
                verticalLineToRelative(dy = 4.08f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.51f, dx2 = -0.9f, dy2 = 4.39f, dx3 = -4.44f, dy3 = 4.39f)
                horizontalLineTo(x = 6.44f)
                curveTo(x1 = 2.89f, y1 = 20.5f, x2 = 2.0f, y2 = 19.62f, x3 = 2.0f, y3 = 16.11f)
                verticalLineTo(y = 7.89f)
                curveTo(x1 = 2.0f, y1 = 4.38f, x2 = 2.89f, y2 = 3.5f, x3 = 6.44f, y3 = 3.5f)
                horizontalLineToRelative(dx = 8.06f)
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
                moveTo(x = 19.08f, y = 4.13f)
                lineToRelative(dx = -3.71f, dy = 3.71f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.31f, dy1 = 0.62f)
                lineToRelative(dx = -0.2f, dy = 1.42f)
                curveToRelative(dx1 = -0.07f, dy1 = 0.51f, dx2 = 0.29f, dy2 = 0.87f, dx3 = 0.8f, dy3 = 0.8f)
                lineToRelative(dx = 1.42f, dy = -0.2f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.62f, dy1 = -0.3f)
                lineToRelative(dx = 3.7f, dy = -3.72f)
                curveToRelative(dx1 = 0.65f, dy1 = -0.64f, dx2 = 0.95f, dy2 = -1.38f, dx3 = 0.0f, dy3 = -2.32f)
                curveToRelative(dx1 = -0.94f, dy1 = -0.95f, dx2 = -1.68f, dy2 = -0.65f, dx3 = -2.32f, dy3 = 0.0f)
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
                moveTo(x = 18.55f, y = 4.66f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.32f, dy1 = 2.32f)
            }
        }.build().also { _cardEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _cardEdit: ImageVector? = null
