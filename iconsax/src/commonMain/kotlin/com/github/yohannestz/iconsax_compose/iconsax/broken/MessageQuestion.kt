package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageQuestion: ImageVector
    get() {
        val current = _messageQuestion
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageQuestion",
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
                moveTo(x = 2.0f, y = 11.56f)
                verticalLineToRelative(dy = 1.87f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 4.0f)
                lineToRelative(dx = 4.45f, dy = 2.96f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 17.0f, y1 = 20.56f)
                verticalLineToRelative(dy = -2.13f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -5.0f, dy2 = 2.0f, dx3 = -5.0f, dy3 = 5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 11.36f)
                verticalLineToRelative(dy = -0.21f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.68f, dx2 = 0.42f, dy2 = -1.04f, dx3 = 0.84f, dy3 = -1.33f)
                curveToRelative(dx1 = 0.41f, dy1 = -0.28f, dx2 = 0.82f, dy2 = -0.64f, dx3 = 0.82f, dy3 = -1.3f)
                arcToRelative(a = 1.66f, b = 1.66f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -3.32f, dy1 = 0.0f)
                moveToRelative(dx = 1.65f, dy = 5.23f)
                horizontalLineTo(x = 12.0f)
            }
        }.build().also { _messageQuestion = it }
    }

@Suppress("ObjectPropertyName")
private var _messageQuestion: ImageVector? = null
