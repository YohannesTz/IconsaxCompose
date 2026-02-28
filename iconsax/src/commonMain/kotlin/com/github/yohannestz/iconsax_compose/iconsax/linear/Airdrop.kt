package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Airdrop: ImageVector
    get() {
        val current = _airdrop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Airdrop",
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
                moveTo(x = 14.13f, y = 11.34f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.68f, dy1 = -2.68f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.59f, dy1 = 1.59f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.68f, dy1 = 2.68f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.59f, dy1 = -1.59f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.01f, y = 17.19f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.78f, dy1 = -6.4f)
                arcToRelative(a = 8.79f, b = 8.79f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -17.58f, dy1 = 0.0f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.81f, dy1 = 6.43f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 14.55f)
                arcToRelative(a = 5.47f, b = 5.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -9.25f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = 9.25f)
                moveToRelative(dx = -5.7f, dy = 2.11f)
                lineToRelative(dx = -1.44f, dy = 1.79f)
                arcToRelative(a = 2.18f, b = 2.18f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.7f, dy1 = 3.54f)
                horizontalLineToRelative(dx = 2.87f)
                arcToRelative(a = 2.18f, b = 2.18f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.7f, dy1 = -3.54f)
                lineToRelative(dx = -1.44f, dy = -1.79f)
                arcToRelative(a = 2.17f, b = 2.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.39f, dy1 = 0.0f)
            }
        }.build().also { _airdrop = it }
    }

@Suppress("ObjectPropertyName")
private var _airdrop: ImageVector? = null
